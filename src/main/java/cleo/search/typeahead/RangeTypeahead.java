/*
 * Copyright (c) 2011 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cleo.search.typeahead;

import cleo.search.Element;
import cleo.search.util.Range;

/**
 * RangeTypeahead
 * 
 * @author jwu
 * @since 03/23, 2011
 */
public interface RangeTypeahead<E extends Element> extends Typeahead<E> {
  
  /**
   * @return the range of this RangeTypeahead.
   */
  public Range getRange();
  
  /**
   * @return the start of this RangeTypeahead.
   */
  public int getRangeStart();
  
  /**
   * @return the end of this RangeTypeahead.
   */
  public int getRangeEnd();
  
}
