package com.codeclan.homework.filingsystem.models.projections;

import com.codeclan.homework.filingsystem.models.File;
import com.codeclan.homework.filingsystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFile", types = Folder.class)
public interface EmbedFiles {
  String getTitle();
  List<File> getFiles();
}
