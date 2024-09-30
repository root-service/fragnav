package ch.rootserviceag.fragnavlibrary

interface FragNavPopController {
    @Throws(UnsupportedOperationException::class)
    fun tryPopFragments(popDepth: Int, transactionOptions: FragNavTransactionOptions?): Int
}
