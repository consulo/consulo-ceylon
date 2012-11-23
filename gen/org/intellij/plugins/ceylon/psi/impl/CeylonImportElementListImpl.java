// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.ceylon.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.plugins.ceylon.psi.*;

public class CeylonImportElementListImpl extends CeylonCompositeElementImpl implements CeylonImportElementList {

  public CeylonImportElementListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<CeylonImportElement> getImportElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CeylonImportElement.class);
  }

  @Override
  @NotNull
  public List<CeylonImportWildcard> getImportWildcardList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CeylonImportWildcard.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CeylonVisitor) ((CeylonVisitor)visitor).visitImportElementList(this);
    else super.accept(visitor);
  }

}
