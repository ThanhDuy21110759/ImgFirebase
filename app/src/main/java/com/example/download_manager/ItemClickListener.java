package com.example.download_manager;

public interface ItemClickListener {
    void onCLickItem(String file_path);
    void onShareClick(DownloadModel downloadModel);
}