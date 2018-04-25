/*
 * Copyright 2017 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.moil.stage.origin;

import com.streamsets.pipeline.api.*;
import com.streamsets.pipeline.api.base.configurablestage.DSource;
import com.streamsets.pipeline.stage.origin.http.HttpClientConfigBean;
import com.streamsets.pipeline.stage.origin.http.Groups;

@StageDef(
    version = 1,
    label = "Drilling API Origin",
    description = "",
    icon = "default.png",
    execution = ExecutionMode.STANDALONE,
    recordsByRef = true,
    onlineHelpRefUrl = ""
)
@HideConfigs(value = {
        "conf.client.numThreads"
})
@ConfigGroups(Groups.class)
@GenerateResourceBundle
public class DrillingAPIDSource extends DSource {

  @ConfigDefBean
  public HttpClientConfigBean conf;

  @Override
  protected Source createSource() {
    return new DrillingAPISource(conf);
  }
}