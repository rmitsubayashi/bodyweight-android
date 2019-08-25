object Modules {
    const val app = ":app"
    object Features {
        const val exerciselist = ":features:exerciselist"
        const val shop = ":features:shop"
        const val shopPresenter = ":features:shop_presenter"
    }

    object Data {
        const val shop = ":data:shop_data"
        const val shopImpl = ":data:shop_rest_sqlite_repo"
    }
}