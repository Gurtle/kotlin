// LANGUAGE: +MultiPlatformProjects
// DIAGNOSTICS: -UNUSED_PARAMETER
// WITH_STDLIB
// WITH_PLATFORM_LIBS

// MODULE: common
// FILE: common.kt

import platform.Foundation.*

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@kotlinx.cinterop.BetaInteropApi
expect annotation class <!NO_ACTUAL_FOR_EXPECT!>MyObjcAction<!>()

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
class TestClass : NSAssertionHandler() {
    @OptIn(kotlinx.cinterop.BetaInteropApi::class)
    @MyObjcAction
    fun String.foo() = println(this)

    @OptIn(kotlinx.cinterop.BetaInteropApi::class)
    @MyObjcAction
    fun foo() = 42

    @OptIn(kotlinx.cinterop.BetaInteropApi::class)
    @MyObjcAction
    fun foo(a: String, b: String, c: String) = println(this)

    @OptIn(kotlinx.cinterop.BetaInteropApi::class)
    @MyObjcAction
    fun action() = println(this)
}

// MODULE: platform()()(common)
// FILE: kotlin.kt
package kotlinx.cinterop

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@BetaInteropApi
public annotation class ObjCAction

// FILE: platform.kt
@OptIn(kotlinx.cinterop.BetaInteropApi::class)
actual typealias MyObjcAction = kotlinx.cinterop.ObjCAction
