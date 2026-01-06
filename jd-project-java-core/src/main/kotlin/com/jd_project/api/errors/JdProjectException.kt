package com.jd_project.api.errors

open class JdProjectException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
