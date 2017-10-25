/*
 * Copyright (C) 2017 George Venios
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.veniosg.dir.android.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.veniosg.dir.android.adapter.FileListViewHolder.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class SearchListAdapter extends RecyclerView.Adapter<FileListViewHolder> {
    private List<String> data = new ArrayList<>();
    private OnItemClickListener onItemClickListener;

    public SearchListAdapter(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setData(@NonNull List<String> data) {
        this.data = data;
        // TODO diff
        // TODO notify right items have changed
        notifyDataSetChanged();
    }

    @Override
    public FileListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FileListViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(FileListViewHolder holder, int position) {
        holder.bind(data.get(position), onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}