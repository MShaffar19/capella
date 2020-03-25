/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.model.handler.advisor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.polarsys.capella.common.helpers.LogExt2;

/**
 * See 'delegateWorkbenchAdvisor' extension point.<br>
 * Will be called by the application workbench advisor at right time.
 */
public interface DelegateWorkbenchAdvisor {

	void preStartup();

	void postStartup();

	void preShutdown();

	void postShutdown();

	String EXTENSION_POINT_ID = "org.polarsys.capella.core.model.handler.delegateWorkbenchAdvisor";

	Helper INSTANCE = new Helper();

	public class Helper {
		public void callPreStartup() {
			try {
				IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
				for (IConfigurationElement elt : configurationElements) {
					DelegateWorkbenchAdvisor delegate = (DelegateWorkbenchAdvisor) elt.createExecutableExtension("class");
					delegate.preStartup();
				}
			} catch (CoreException e) {
				logError(e);
			}
		}

		public void callPostStartup() {
			try {
				IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
				for (IConfigurationElement elt : configurationElements) {
					DelegateWorkbenchAdvisor delegate = (DelegateWorkbenchAdvisor) elt.createExecutableExtension("class");
					delegate.postStartup();
				}
			} catch (CoreException e) {
				logError(e);
			}
		}

		public void callPreShutdown() {
			try {
				IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
				for (IConfigurationElement elt : configurationElements) {
					DelegateWorkbenchAdvisor delegate = (DelegateWorkbenchAdvisor) elt.createExecutableExtension("class");
					delegate.preShutdown();
				}
			} catch (CoreException e) {
				logError(e);
			}
		}

		public void callPostShutdown() {
			try {
				IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
				for (IConfigurationElement elt : configurationElements) {
					DelegateWorkbenchAdvisor delegate = (DelegateWorkbenchAdvisor) elt.createExecutableExtension("class");
					delegate.postShutdown();
				}
			} catch (CoreException e) {
				logError(e);
			}
		}

		private void logError(CoreException e) {
			LogExt2.log(new Status(IStatus.ERROR, "org.polarsys.capella.core.model.handler", e.getMessage(), e));
		}
	}

}
