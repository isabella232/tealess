/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.tealess.cli.input;

import co.elastic.tealess.cli.Setting;
import co.elastic.tealess.cli.Setting.InputHandler;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInput implements InputHandler<Path> {
  public static final PathInput singleton = new PathInput();

  @Override
  public boolean isValid(Path value) {
    return Files.exists((Path) value);
  }

  @Override
  public Path parse(String text) {
    return Paths.get(text);
  }
}
