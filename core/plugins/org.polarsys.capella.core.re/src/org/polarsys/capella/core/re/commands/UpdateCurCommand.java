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
package org.polarsys.capella.core.re.commands;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.capella.core.re.launcher.UpdateCurLauncher;
import org.polarsys.capella.common.re.launcher.ReLauncher;

/**
 *
 */
public class UpdateCurCommand extends org.polarsys.capella.common.re.commands.UpdateCurCommand {

  /**
   * @param _rootElement_p
   * @param progressMonitor_p
   */
  public UpdateCurCommand(Collection<?> selection_p, IProgressMonitor progressMonitor_p) {
    super(selection_p, progressMonitor_p);
  }

  @Override
  protected ReLauncher createLauncher() {
    return new UpdateCurLauncher();
  }
}
