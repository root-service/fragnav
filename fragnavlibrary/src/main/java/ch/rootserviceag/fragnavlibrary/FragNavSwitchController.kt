package ch.rootserviceag.fragnavlibrary

interface FragNavSwitchController {
    fun switchTab(
        @FragNavController.TabIndex index: Int,
        transactionOptions: FragNavTransactionOptions?
    )
}
