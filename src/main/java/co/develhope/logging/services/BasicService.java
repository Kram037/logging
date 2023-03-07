package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Value("${customEnvs.n1}")
    private double n1;

    @Value("${customEnvs.n2}")
    private double n2;

    public double getExp(){
        logger.debug("Starting calculation");
        double t = Math.pow(n1, n2);
        logger.debug("Calculation ended");
        return t;
    }
}