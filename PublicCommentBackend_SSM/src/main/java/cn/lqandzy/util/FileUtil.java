package cn.lqandzy.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
/**
 * 文件操作工具类
 * @author 慕祈
 *
 */
public class FileUtil {

	/**
	 * 将MultipartFile保存到指定的路径下
	 * 
	 * @param file
	 *            Spring的MultipartFile对象
	 * @param savePath
	 *            保存路径
	 * @return 保存的文件名，当返回NULL时为保存失败。
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	public static String save(MultipartFile file, String savePath) throws IllegalStateException, IOException {
		if (file != null && file.getSize() > 0) {
			//文件保存路径（如果保存路径不存在，则创建）
			File fileFolder = new File(savePath);
			if (!fileFolder.exists()) {
				fileFolder.mkdirs();
			}
			//获取拥有保存路径和文件名称的文件类
			File saveFile = getFile(savePath, file.getOriginalFilename());
			file.transferTo(saveFile);
			return saveFile.getName();
		}
		return null;
	}

	/**
	 * 删除文件
	 * 
	 * @param filePath
	 *            文件路径
	 * @return 是否删除成功：true-删除成功，false-删除失败
	 */
	public static boolean delete(String filePath) {
		File file = new File(filePath);
		if (file.isFile()) {
			file.delete();
			return true;
		}
		return false;
	}

	/**
	 * 获取拥有保存路径和文件名称的文件类
	 * @param savePath 保存路径
	 * @param originalFilename 文件名称
	 * @return
	 */
	private static File getFile(String savePath, String originalFilename) {
		//重写图片的名字
		String fileName = System.currentTimeMillis() + "_" + originalFilename;
		//保存路径与新的文件名
		File file = new File(savePath + fileName);
		
		//如果这个文件在保存路径下已经存在，递归一次，在写一次文件名
		if (file.exists()) {
			return getFile(savePath, originalFilename);
		}
		return file;
	}
}