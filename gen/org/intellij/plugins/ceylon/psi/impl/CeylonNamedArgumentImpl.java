// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.ceylon.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.intellij.plugins.ceylon.psi.*;

public class CeylonNamedArgumentImpl extends CeylonCompositeElementImpl implements CeylonNamedArgument {

  public CeylonNamedArgumentImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public CeylonCompilerAnnotations getCompilerAnnotations() {
    return findNotNullChildByClass(CeylonCompilerAnnotations.class);
  }

  @Override
  @Nullable
  public CeylonNamedArgumentDeclaration getNamedArgumentDeclaration() {
    return findChildByClass(CeylonNamedArgumentDeclaration.class);
  }

  @Override
  @Nullable
  public CeylonNamedSpecifiedArgument getNamedSpecifiedArgument() {
    return findChildByClass(CeylonNamedSpecifiedArgument.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CeylonVisitor) ((CeylonVisitor)visitor).visitNamedArgument(this);
    else super.accept(visitor);
  }

}
