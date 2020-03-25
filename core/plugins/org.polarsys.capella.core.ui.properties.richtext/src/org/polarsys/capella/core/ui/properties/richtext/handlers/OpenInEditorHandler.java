/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.ui.properties.richtext.handlers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.FrameworkUtil;
import org.polarsys.capella.common.helpers.LogExt2;
import org.polarsys.capella.core.ui.properties.richtext.editor.CapellaMDERichTextEditor;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;


public class OpenInEditorHandler implements MDERichTextToolbarItemHandler {

  @Override
  public void execute(MDERichTextWidget richText) {
    richText.saveContent();
    EObject owner = richText.getElement();
    EStructuralFeature feature = richText.getFeature();
    IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    MDERichTextEditorInput input = new MDERichTextEditorInput(owner, feature, richText.getSaveStrategy());
    
    try {
      activePage.openEditor(input, CapellaMDERichTextEditor.ID);
    } catch (PartInitException e) {
      Status status = new Status(IStatus.ERROR, FrameworkUtil.getBundle(getClass()).getSymbolicName(), e.getMessage(), e);
      LogExt2.log(status);
    }

  }

}
