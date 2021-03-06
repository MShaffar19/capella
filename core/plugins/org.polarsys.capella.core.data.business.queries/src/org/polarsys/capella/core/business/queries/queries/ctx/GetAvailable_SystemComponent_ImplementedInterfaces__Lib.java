/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.business.queries.queries.ctx;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.ExtendingQuery;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.business.queries.queries.ctx.GetAvailable_SystemComponent_ImplementedInterfaces;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.business.queries.queries.cs.AbstractComponentHelpers;

@ExtendingQuery (extendingQuery = GetAvailable_SystemComponent_ImplementedInterfaces.class)
public class GetAvailable_SystemComponent_ImplementedInterfaces__Lib extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    CapellaElement capellaElement = (CapellaElement) input;
    List<EObject> availableElements = AbstractComponentHelpers.getAvailableElements_Component_ImplementedInterface(capellaElement);
    return (List) availableElements;
  }

}
