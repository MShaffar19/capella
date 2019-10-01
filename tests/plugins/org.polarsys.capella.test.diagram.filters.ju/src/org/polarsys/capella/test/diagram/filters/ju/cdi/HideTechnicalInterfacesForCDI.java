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
package org.polarsys.capella.test.diagram.filters.ju.cdi;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;
import org.polarsys.capella.test.diagram.filters.ju.DefaultActivatedFilterTestCase;

public class HideTechnicalInterfacesForCDI extends DefaultActivatedFilterTestCase {

  private final String TECHNICAL_INTERFACE_ID = "acb1f164-5083-45cb-a546-316ccb156bd3";

  @Override
  protected String getTestProjectName() {
    return "StandardDiagramFiltersModel";
  }

  @Override
  protected String getDiagramName() {
    return "[CDI] Contextual Component Detailed Interfaces";
  }

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_CDI_HIDE_TECHNICALS_INTERFACES;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(new String[] { TECHNICAL_INTERFACE_ID });
  }
}