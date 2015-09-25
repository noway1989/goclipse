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
package LANG_PROJECT_ID.ide.ui.preferences;


import melnorme.lang.ide.ui.LangUIPlugin;
import melnorme.lang.ide.ui.preferences.common.AbstractPreferencesBlockPrefPage;


public class EditorPreferencePage extends AbstractPreferencesBlockPrefPage {
	
	public EditorPreferencePage() {
		super(LangUIPlugin.getInstance().getPreferenceStore());
	}
	
	@Override
	protected EditorConfigurationBlock createPreferencesComponent() {
		return new EditorConfigurationBlock(this);
	}
	
	@Override
	protected String getHelpId() {
		return null;
	}
	
}