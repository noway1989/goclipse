/*******************************************************************************
 * Copyright (c) 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.ide.ui.wizards;

import melnorme.lang.ide.ui.dialogs.LangProjectWizardTest;
import LANG_PROJECT_ID.ide.ui.wizards.LANGUAGE_ProjectWizard;


public class LANGUAGE_ProjectWizardTest extends LangProjectWizardTest {
	
	@Override
	protected LANGUAGE_ProjectWizard createNewProjectWizard() {
		return new LANGUAGE_ProjectWizard();
	}
	
}