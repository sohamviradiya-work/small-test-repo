package org;

import org.advanced.AdvancedCalculatorTest;
import org.basic.BasicCalculatorTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdvancedCalculatorTest.class, BasicCalculatorTest.class})
public class CalculatorTestSuite {
    
}
