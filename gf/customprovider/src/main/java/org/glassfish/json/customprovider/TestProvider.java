/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package org.glassfish.json.customprovider;

import javax.json.JsonArray;
import javax.json.JsonConfiguration;
import javax.json.JsonFeature;
import javax.json.JsonObject;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParserFactory;
import javax.json.spi.JsonProvider;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jitendra Kotamraju
 */
public class TestProvider extends JsonProvider {

    @Override
    public JsonGenerator createGenerator(Writer writer) {
        return new TestGenerator(writer);
    }

    @Override
    public JsonGenerator createGenerator(Writer writer, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonGenerator createGenerator(OutputStream out) {
        return null;
    }

    @Override
    public JsonGenerator createGenerator(OutputStream out, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonGenerator createGenerator(OutputStream out, Charset charset) {
        return null;
    }

    @Override
    public JsonGenerator createGenerator(OutputStream out, Charset charset, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParser createParser(Reader reader) {
        return null;
    }

    @Override
    public JsonParser createParser(Reader reader, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParser createParser(InputStream in) {
        return null;
    }

    @Override
    public JsonParser createParser(InputStream in, Charset charset) {
        return null;
    }

    @Override
    public JsonParser createParser(InputStream in, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParser createParser(InputStream in, Charset charset, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParser createParser(JsonArray array) {
        return null;
    }

    @Override
    public JsonParser createParser(JsonArray array, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParser createParser(JsonObject object) {
        return null;
    }

    @Override
    public JsonParser createParser(JsonObject object, JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonParserFactory createParserFactory() {
        return null;
    }

    @Override
    public JsonParserFactory createParserFactory(JsonConfiguration config) {
        return null;
    }

    @Override
    public JsonGeneratorFactory createGeneratorFactory() {
        return null;
    }

    @Override
    public JsonGeneratorFactory createGeneratorFactory(JsonConfiguration config) {
        return null;
    }

}
