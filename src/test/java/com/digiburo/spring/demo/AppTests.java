package com.digiburo.spring.demo;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//RunWith(SpringJUnit4ClassRunner.class)
//ContextConfiguration("classpath:message-configuration.xml")
public class AppTests {
    /*
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("sampleJob")
    private Job job;

    @Test
    public void testJob() throws Exception {
        JobParametersBuilder builder = new JobParametersBuilder();
        JobExecution jobExecution = jobLauncher.run(job, builder.toJobParameters());
        Assert.assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());
    }
    */
}
