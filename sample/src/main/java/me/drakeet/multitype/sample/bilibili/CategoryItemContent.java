/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.multitype.sample.bilibili;

import android.support.annotation.NonNull;
import me.drakeet.multitype.ItemContent;

/**
 * You also could use {@link Category} as your CategoryItemContent directly
 * @author drakeet
 */
public class CategoryItemContent implements ItemContent {

    public final Category category;


    public CategoryItemContent(@NonNull final Category category) {this.category = category;}
}
