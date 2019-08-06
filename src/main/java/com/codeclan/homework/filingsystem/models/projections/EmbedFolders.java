package com.codeclan.homework.filingsystem.models.projections;

import com.codeclan.homework.filingsystem.models.Folder;
import com.codeclan.homework.filingsystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {
  String getName();
  List<Folder> getFolders();
}
