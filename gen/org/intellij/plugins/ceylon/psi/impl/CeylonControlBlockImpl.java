// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.ceylon.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.intellij.plugins.ceylon.psi.*;

public class CeylonControlBlockImpl extends CeylonCompositeElementImpl implements CeylonControlBlock {

  public CeylonControlBlockImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public CeylonBlock getBlock() {
    return findNotNullChildByClass(CeylonBlock.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CeylonVisitor) ((CeylonVisitor)visitor).visitControlBlock(this);
    else super.accept(visitor);
  }

}
