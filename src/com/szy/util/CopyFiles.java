package com.szy.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * 拷贝文件夹
 * 
 * @author szy
 * @date 2018年2月6日
 * @version v1.0.0
 *
 */
public class CopyFiles {
	private String srcDir;
	private String destDir;

	public CopyFiles() {
	}

	public CopyFiles(String srcDir, String destDir) {
		this.srcDir = srcDir;
		this.destDir = destDir;
	}

	public List<String> getDiffDirs() {
		File src = new File(srcDir);
		File dest = new File(destDir);
		File[] srcFiles = getFileList(src);
		System.out.println(srcFiles.length);
		File[] destFiles = getFileList(dest);
		System.out.println(destFiles.length);
		return null;
	}

	private File[] getFileList(File file) {
		if (!file.isDirectory()) {
			return new File[] {};
		}

		return file.listFiles();
	}

	public static void main(String[] args) {
		String srcDir = "C:\\Users\\szy\\Desktop\\1";
		// 'C' 字符前有一个 特殊字符，可能是中文空格之类的 8234
		// String destDir = "‪C:\\Users\\szy\\Desktop\\2";
		String destDir = "C:\\Users\\szy\\Desktop\\2";
		// CopyFiles copyFiles = new CopyFiles(srcDir, destDir);
		// copyFiles.getDiffDirs();
		CopyFiles copyFiles = new CopyFiles();
		// System.out.println(copyFiles.getFileList(new File(srcDir)).length);
		// System.out.println(copyFiles.getFileList(new File(destDir)).length);
		try {
			copyFiles.copyDir(srcDir, destDir);
			System.out.println("操作完成.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 复制文件的方法
	 * 
	 * @param srcPath
	 *            原文件路径
	 * @param destPath
	 *            目标文件路径
	 * @throws Exception
	 * @return void
	 */
	private void copyFile(String srcPath, String destPath) throws Exception {
		File src = new File(srcPath);
		File dest = new File(destPath);

		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		byte[] buffer = new byte[1024];
		int n = 0;
		while ((n = in.read(buffer)) != -1) {
			out.write(buffer, 0, n);
		}

		in.close();
		out.close();
	}

	/**
	 * 复制文件夹的方法
	 * 
	 * @param srcPath
	 *            原文件夹路径
	 * @param destPath
	 *            目标文件夹路径
	 * @return void
	 * @throws Exception
	 */
	private void copyDir(String srcPath, String destPath) throws Exception {
		File src = new File(srcPath);
		if (!src.exists() || !src.isDirectory()) {
			throw new Exception("目录: " + srcPath + ", 不存在");
		}

		String[] dirPaths = src.list();

		File dest = new File(destPath);
		if (!dest.exists()) {
			dest.mkdir();
		}

		for (int i = 0; i < dirPaths.length; i++) {
			String newSrcFilePath = srcPath + File.separator + dirPaths[i];
			String newDestFilePath = destPath + File.separator + dirPaths[i];
			File newFile = new File(newSrcFilePath);
			if (newFile.isFile()) {
				copyFile(newSrcFilePath, newDestFilePath);
			} else {
				copyDir(newSrcFilePath, newDestFilePath);
			}
		}
	}
}
