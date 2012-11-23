// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.ceylon.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.intellij.plugins.ceylon.psi.*;

public class CeylonMatchCaseConditionImpl extends CeylonCompositeElementImpl implements CeylonMatchCaseCondition {

  public CeylonMatchCaseConditionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public CeylonExpressions getExpressions() {
    return findNotNullChildByClass(CeylonExpressions.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CeylonVisitor) ((CeylonVisitor)visitor).visitMatchCaseCondition(this);
    else super.accept(visitor);
  }

}
