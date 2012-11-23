package org.intellij.plugins.ceylon.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.plugins.ceylon.CeylonLanguage;
import org.jetbrains.annotations.NonNls;

public class CeylonElementType extends IElementType {

    public CeylonElementType(@NonNls String debugName) {
        super(debugName, CeylonLanguage.INSTANCE);
    }
}