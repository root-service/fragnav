package ch.rootserviceag.fragnavlibrary.tabhistory

import ch.rootserviceag.fragnavlibrary.FragNavSwitchController

sealed class NavigationStrategy

class CurrentTabStrategy : NavigationStrategy()

class UnlimitedTabHistoryStrategy(val fragNavSwitchController: FragNavSwitchController) :
    NavigationStrategy()

class UniqueTabHistoryStrategy(val fragNavSwitchController: FragNavSwitchController) :
    NavigationStrategy()