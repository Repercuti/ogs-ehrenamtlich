package de.children.agplanner.components;

import de.children.agplanner.repositories.KindRepository;
import de.children.agplanner.service.AGService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private static final Logger LOG =
      LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

    @Autowired
    AGService agService;

    @Override
    public void run(String...args) throws Exception {
        LOG.info("Initializing Command Line Runner");
        List test = agService.getAllChildren();
        LOG.info(test.size() + "");
        LOG.info("LUISTE");
    }
}