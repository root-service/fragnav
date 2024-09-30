package ch.rootserviceag.fragnavlibrary.tabhistory

import android.os.Bundle

import ch.rootserviceag.fragnavlibrary.FragNavPopController
import ch.rootserviceag.fragnavlibrary.FragNavTransactionOptions

class CurrentTabHistoryController(fragNavPopController: FragNavPopController) :
    BaseFragNavTabHistoryController(
        fragNavPopController
    ) {

    @Throws(UnsupportedOperationException::class)
    override fun popFragments(
        popDepth: Int,
        transactionOptions: FragNavTransactionOptions?
    ): Boolean {
        return fragNavPopController.tryPopFragments(popDepth, transactionOptions) > 0
    }

    override fun switchTab(index: Int) {}

    override fun onSaveInstanceState(outState: Bundle) {}

    override fun restoreFromBundle(savedInstanceState: Bundle?) {}
}
