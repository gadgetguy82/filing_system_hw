package com.codeclan.homework.filingsystem.models.projections;

import com.codeclan.homework.filingsystem.models.File;
import com.codeclan.homework.filingsystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
  String getName();
  String getExtension();
  int getSize();
  Folder getFolder();
}
