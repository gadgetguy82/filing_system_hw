package com.codeclan.homework.filingsystem.components;

import com.codeclan.homework.filingsystem.models.File;
import com.codeclan.homework.filingsystem.models.Folder;
import com.codeclan.homework.filingsystem.models.User;
import com.codeclan.homework.filingsystem.repositories.FileRepository;
import com.codeclan.homework.filingsystem.repositories.FolderRepository;
import com.codeclan.homework.filingsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

  @Autowired
  UserRepository userRepository;

  @Autowired
  FolderRepository folderRepository;

  @Autowired
  FileRepository fileRepository;

  public DataLoader() {

  }

  public void run(ApplicationArguments args) {
    User auto = new User("Auto");
    userRepository.save(auto);

    User bot = new User("Bot");
    userRepository.save(bot);

    Folder ruby = new Folder("ruby_files", auto);
    folderRepository.save(ruby);

    Folder javaScript = new Folder("javaScript_files", auto);
    folderRepository.save(javaScript);

    Folder java = new Folder("java_files", bot);
    folderRepository.save(java);

    File transform = new File("transform", ".rb", 20, ruby);
    fileRepository.save(transform);

    File merge = new File("merge", ".js", 30, javaScript);
    fileRepository.save(merge);

    File roll = new File("roll", ".java", 36, java);
    fileRepository.save(roll);

    File out = new File("out", ".java", 14, java);
    fileRepository.save(out);
  }
}
