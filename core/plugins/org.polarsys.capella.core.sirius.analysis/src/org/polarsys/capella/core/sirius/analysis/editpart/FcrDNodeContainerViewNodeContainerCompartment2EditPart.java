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
package org.polarsys.capella.core.sirius.analysis.editpart;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartment2EditPart;

public class FcrDNodeContainerViewNodeContainerCompartment2EditPart
    extends DNodeContainerViewNodeContainerCompartment2EditPart {

  public FcrDNodeContainerViewNodeContainerCompartment2EditPart(View view) {
    super(view);
  }

  @Override
  protected void configureBorder(ResizableCompartmentFigure rcf) {
    super.configureBorder(rcf);
    Border border = rcf.getBorder();
    if (border instanceof LineBorder) {
      // Set the border to the same color so it is not visible.
      ((LineBorder) border).setColor(rcf.getBackgroundColor());
    }
  }
}