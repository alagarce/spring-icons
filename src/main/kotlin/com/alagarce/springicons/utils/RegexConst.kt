package com.alagarce.springicons.utils

object Regex {

    // -------------------------
    // FILE REGEXES
    // -------------------------
    const val FILE_CONTROLLER = ".*Controller.*\\.java$"
    const val FILE_SERVICE = ".*Service.*\\.java$"
    const val FILE_REPOSITORY = ".*Repository.*\\.java$"
    const val FILE_MAPPER = ".*(Mapper|Utils|Util).*\\.java$"
    const val FILE_ERROR = ".*(Error|Exception).*\\.java$"
    const val FILE_MODEL = ".*(Entity|Model).*\\.java$"
    const val FILE_CONFIG = ".*Config.*\\.java$"
    const val FILE_ENUM = ".*Enum.*\\.java$"
    const val FILE_EVENT = ".*(Event|Listener).*\\.java$"
    const val FILE_INPUT = ".*(Input|Request).*\\.java$"
    const val FILE_OUTPUT = ".*Output.*\\.java$"
    const val FILE_DTO = ".*(Dto|DTO|Record).*\\.java$"
    const val FILE_SCHEDULE = ".*(Scheduler|Job|TaskCron|Cronjob).*\\.java$"
    const val FILE_SECURITY = ".*(Security|Auth).*\\.java$"
    const val FILE_VALIDATOR = ".*(Validator|Guard).*\\.java$"
    const val FILE_FILTER = ".*(Filter|Criteria|Specification).*\\.java$"
    const val FILE_TEST = ".*(Test|Tests)\\.java$"
    const val FILE_APP = "(^|.*)(App|Application|Main)\\.java$"
    const val FILE_CLIENT = ".*Client.*\\.java$"
    const val FILE_GIT = "\\.git.*"
    const val FILE_GRADLE = ".*\\.gradle.*"
    const val FILE_TERMINAL = "(gradlew|mvnw)"
    const val FILE_SHELL = ".*\\.(sh|bat|cmd|ps1)$"
    const val FILE_PROPERTIES = ".*\\.properties$"
    const val FILE_DEFAULT = ".*\\.java$"

    // -------------------------
    // FOLDER REGEXES
    // -------------------------
    const val FOLDER_CONTROLLER = ".*/controller.*"
    const val FOLDER_SERVICE = ".*/service.*"
    const val FOLDER_FILTER = ".*/(criteria|filter|specification).*"
    const val FOLDER_REPOSITORY = ".*/repository.*"
    const val FOLDER_DTO = ".*/dto.*"
    const val FOLDER_MAPPER = ".*/(mapper|utils).*"
    const val FOLDER_MODEL = ".*/(model|entity|domain).*"
    const val FOLDER_CONFIG = ".*/config.*"
    const val FOLDER_ERROR = ".*/(error|exception).*"
    const val FOLDER_CLIENT = ".*/client.*"
    const val FOLDER_SECURITY = ".*/(security|auth).*"
    const val FOLDER_VALIDATOR = ".*/(validator|guard).*"
    const val FOLDER_ENUM = ".*/.*enum.*"
    const val FOLDER_EVENT = ".*/(event|listener).*"
    const val FOLDER_SCHEDULE = ".*/(scheduler|job|cronjob).*"
    const val FOLDER_SPECS = ".*/(specs|doc).*"
    const val FOLDER_SHARED = ".*/(shared|common).*"
    const val FOLDER_TEST = ".*/test.*"
    const val FOLDER_RESOURCES = ".*/resources.*"
    const val FOLDER_MAIN = ".*/main.*"
    const val FOLDER_TESTS = ".*/tests.*"
    const val FOLDER_APP = ".*/app"
    const val FOLDER_SRC = ".*/src$"
    const val FOLDER_HIDDEN = ".*/\\.[^/]+$"
    const val FOLDER_BUILD = ".*/(build|target|gradle)$"

    // -------------------------
    // OTHER REGEXES
    // -------------------------
    const val MOCK_REGEX = ".*(Mock|Fake|Stub)\\.java$"
}