package org.pt2.laundry.network

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UpdateWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {
    override fun doWork(): Result {
        Log.d("Worker", "Menjalankan proses background..")
        return Result.success()
    }
}