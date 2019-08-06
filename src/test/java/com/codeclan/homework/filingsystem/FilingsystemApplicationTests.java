package com.codeclan.homework.filingsystem;

import com.codeclan.homework.filingsystem.models.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilingsystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFile() {
		File file = new File("test", ".rb", 20);
	}

}
