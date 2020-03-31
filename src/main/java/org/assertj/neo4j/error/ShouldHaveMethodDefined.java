/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2013-2019 the original author or authors.
 */
package org.assertj.neo4j.error;

import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;

public class ShouldHaveMethodDefined extends BasicErrorMessageFactory {

  private ShouldHaveMethodDefined(Object actual, String methodName, String minVersion) {
    super("\nExpecting actual to define method called %s (requires Neo4j %s or later)", methodName, minVersion);

  }

  public static ErrorMessageFactory shouldHaveMethodDefined(Object actual, String methodName, String minVersion) {
    return new ShouldHaveMethodDefined(actual, methodName, minVersion);
  }
}
