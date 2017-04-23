/*
 * Copyright 2017 Niklas Persson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.equadon.intellij.mips.run.debugger;

import com.equadon.intellij.mips.lang.MipsLanguage;
import com.equadon.intellij.mips.run.MipsRunConfiguration;
import com.intellij.execution.DefaultExecutionResult;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.console.LanguageConsoleImpl;
import com.intellij.execution.filters.TextConsoleBuilder;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MipsDebugConsoleState implements RunProfileState {
  private final MipsRunConfiguration cfg;
  private final Project project;

  public MipsDebugConsoleState(MipsRunConfiguration cfg, Project project) {
    this.cfg = cfg;
    this.project = project;
  }

  @Nullable
  @Override
  public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
    return new DefaultExecutionResult();
  }

  public ConsoleView createConsoleView(Project project) {
    TextConsoleBuilder builder = TextConsoleBuilderFactory.getInstance().createBuilder(project);

    return builder.getConsole();
  }
}