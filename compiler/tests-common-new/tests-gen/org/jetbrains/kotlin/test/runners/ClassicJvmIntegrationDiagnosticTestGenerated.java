/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/jvmIntegration")
@TestDataPath("$PROJECT_ROOT")
public class ClassicJvmIntegrationDiagnosticTestGenerated extends AbstractClassicJvmIntegrationDiagnosticTest {
  @Test
  public void testAllFilesPresentInJvmIntegration() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/modules")
  @TestDataPath("$PROJECT_ROOT")
  public class Modules {
    @Test
    public void testAllFilesPresentInModules() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/modules"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("dependOnManyModules.kt")
    public void testDependOnManyModules() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/dependOnManyModules.kt");
    }

    @Test
    @TestMetadata("internalJdkPackageUsage.kt")
    public void testInternalJdkPackageUsage() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/internalJdkPackageUsage.kt");
    }

    @Test
    @TestMetadata("jdkModulesFromNamed.kt")
    public void testJdkModulesFromNamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkModulesFromNamed.kt");
    }

    @Test
    @TestMetadata("jdkModulesFromUnnamed.kt")
    public void testJdkModulesFromUnnamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkModulesFromUnnamed.kt");
    }

    @Test
    @TestMetadata("nonTransitiveDoesNotAffectExplicitDependency.kt")
    public void testNonTransitiveDoesNotAffectExplicitDependency() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/nonTransitiveDoesNotAffectExplicitDependency.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/simple.kt");
    }

    @Test
    @TestMetadata("simpleUseNonExportedPackage.kt")
    public void testSimpleUseNonExportedPackage() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/simpleUseNonExportedPackage.kt");
    }

    @Test
    @TestMetadata("sourcelessSmartcastSourcefulOriginalExpression.kt")
    public void testSourcelessSmartcastSourcefulOriginalExpression() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/sourcelessSmartcastSourcefulOriginalExpression.kt");
    }

    @Test
    @TestMetadata("unnamedDependsOnNamed.kt")
    public void testUnnamedDependsOnNamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/unnamedDependsOnNamed.kt");
    }

    @Test
    @TestMetadata("unnamedDoesNotReadNotAdded.kt")
    public void testUnnamedDoesNotReadNotAdded() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/unnamedDoesNotReadNotAdded.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag")
    @TestDataPath("$PROJECT_ROOT")
    public class JdkReleaseFlag {
      @Test
      public void testAllFilesPresentInJdkReleaseFlag() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("conflictWithJvmTarget.kt")
      public void testConflictWithJvmTarget() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/conflictWithJvmTarget.kt");
      }

      @Test
      @TestMetadata("jdk11.kt")
      public void testJdk11() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk11.kt");
      }

      @Test
      @TestMetadata("jdk11Release12.kt")
      public void testJdk11Release12() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk11Release12.kt");
      }

      @Test
      @TestMetadata("jdk17.kt")
      public void testJdk17() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk17.kt");
      }

      @Test
      @TestMetadata("unknownReleaseVersion.kt")
      public void testUnknownReleaseVersion() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/unknownReleaseVersion.kt");
      }
    }
  }
}
