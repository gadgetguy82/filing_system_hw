package com.codeclan.homework.filingsystem;

import com.codeclan.homework.filingsystem.models.File;
import com.codeclan.homework.filingsystem.models.Folder;
import com.codeclan.homework.filingsystem.repositories.FileRepository;
import com.codeclan.homework.filingsystem.repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilingsystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFolderAndFileThenSave() {
		Folder folder = new Folder("ruby_files");
		folderRepository.save(folder);

		File file = new File("test", ".rb", 20, folder);
		fileRepository.save(file);
	}

}
