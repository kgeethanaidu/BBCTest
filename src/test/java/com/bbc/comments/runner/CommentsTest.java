package com.bbc.comments.runner;

import com.bbc.comments.pageobjects.BasePage;
import com.bbc.comments.steps.CommentStepDefs;
import com.bbc.comments.steps.CommonSteps;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/comment.feature",
        glue = {"com.bbc.comments.steps"},
        format = {"html:target/comment_report"},
        tags = {"@comments"})
public class CommentsTest {

    @AfterClass
    public static void cleanUp() {
        if (CommonSteps.driver != null) {
            CommonSteps.driver.close();
        }
    }
}
