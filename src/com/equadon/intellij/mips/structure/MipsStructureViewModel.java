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

package com.equadon.intellij.mips.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.psi.PsiFile;

import org.jetbrains.annotations.NotNull;

public class MipsStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
  public MipsStructureViewModel(@NotNull PsiFile file) {
    super(file, new MipsStructureViewElement(file));
  }

  @Override
  public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
    return false;
  }

  @Override
  public boolean isAlwaysLeaf(StructureViewTreeElement structureViewTreeElement) {
    return false;
  }
}
