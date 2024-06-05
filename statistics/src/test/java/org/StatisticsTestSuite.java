package org;

import org.advanced.AdvancedStatisticsTest;
import org.basic.BasicStatisticsTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdvancedStatisticsTest.class,BasicStatisticsTest.class})
public class StatisticsTestSuite {
    
}
