/**
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.streaming.factory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stratio.streaming.commons.messages.ColumnNameTypeValue;
import com.stratio.streaming.serializer.gson.impl.ColumnNameTypeValueDeserializer;

public class GsonFactory {

    private static Gson INSTANCE;

    public static Gson getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GsonBuilder().registerTypeAdapter(ColumnNameTypeValue.class,
                    new ColumnNameTypeValueDeserializer()).create();
        }
        return INSTANCE;
    }
}
