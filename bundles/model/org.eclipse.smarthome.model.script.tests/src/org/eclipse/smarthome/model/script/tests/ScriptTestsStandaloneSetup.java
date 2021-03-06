/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.model.script.tests;

import org.eclipse.smarthome.model.script.ScriptRuntimeModule;
import org.eclipse.smarthome.model.script.ScriptStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ScriptTestsStandaloneSetup extends ScriptStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new ScriptRuntimeModule(), new ScriptTestsModule());
	}
}
