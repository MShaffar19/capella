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

package org.polarsys.capella.core.business.queries.queries.information;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.ExtendingQuery;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.business.queries.queries.information.GetAvailable_NumericType_InheritedNumericType;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.data.information.datatype.PhysicalQuantity;
import org.polarsys.capella.core.model.helpers.queries.QueryIdentifierConstants;

@ExtendingQuery (extendingQuery = GetAvailable_NumericType_InheritedNumericType.class)
public class GetAvailable_NumericType_InheritedNumericType__Lib extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    CapellaElement capellaElement = (CapellaElement) input;
    List<EObject> availableElements = getAvailableElements(capellaElement);
    return (List) availableElements;
  }

  /**
   * @see org.polarsys.capella.core.business.abstractqueries.CapellaElement_CurrentAndHigherLevelsQuery#getAvailableElements(EObject)
   */
  public List<EObject> getAvailableElements(CapellaElement element) {
    List<EObject> availableElements =
        AbstractTypeHelpers.getAvailableElements_Type_InheritedType(element, DatatypePackage.Literals.NUMERIC_TYPE,
            QueryIdentifierConstants.GET_ALL_NUMERIC_TYPES);
    List<EObject> excludedElements = new ArrayList<EObject>();
    for (EObject capellaElement : availableElements) {
      if (capellaElement instanceof PhysicalQuantity) {
        excludedElements.add(capellaElement);
      }
    }
    availableElements.removeAll(excludedElements);
    return availableElements;
  }

}
