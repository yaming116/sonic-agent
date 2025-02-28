/*
 *   sonic-agent  Agent of Sonic Cloud Real Machine Platform.
 *   Copyright (C) 2022 SonicCloudOrg
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published
 *   by the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.cloud.sonic.agent.tests.script;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.cloud.sonic.agent.tests.handlers.AndroidStepHandler;
import org.cloud.sonic.agent.tests.handlers.IOSStepHandler;

public class GroovyScriptImpl implements GroovyScript {
    @Override
    public void runAndroid(AndroidStepHandler androidStepHandler, String script) {
        Binding binding = new Binding();
        binding.setVariable("androidStepHandler", androidStepHandler);
        GroovyShell gs = new GroovyShell(binding);
        gs.evaluate(script);
    }

    @Override
    public void runIOS(IOSStepHandler iosStepHandler, String script) {
        Binding binding = new Binding();
        binding.setVariable("iosStepHandler", iosStepHandler);
        GroovyShell gs = new GroovyShell(binding);
        gs.evaluate(script);
    }
}
