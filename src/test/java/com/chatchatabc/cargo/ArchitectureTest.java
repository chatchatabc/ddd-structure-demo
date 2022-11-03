package com.chatchatabc.cargo;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

/**
 * architecture test
 *
 * @author linux_china
 */
@AnalyzeClasses(packages = ArchitectureTest.BASE_PACKAGE)
public class ArchitectureTest {
    public static final String BASE_PACKAGE = "com.chatchatabc.cargo";

    @ArchTest
    static final ArchRule domain_layer_should_not_depend_on_application_and_infra_layers =
            noClasses().that().resideInAPackage(BASE_PACKAGE + ".domain..")
                    .should().dependOnClassesThat().resideInAnyPackage(BASE_PACKAGE + ".application..", BASE_PACKAGE + ".infra..");
}
