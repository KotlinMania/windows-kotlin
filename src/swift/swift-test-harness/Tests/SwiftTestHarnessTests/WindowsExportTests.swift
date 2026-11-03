import Testing
import Windows

@Suite("Windows Swift Export Suite")
struct WindowsExportTests {
    @Test("Swift module imports cleanly and basic types work")
    func swiftModuleLoads() throws {
        _ = Windows.shared
        let dt = foundation.DateTime(universalTime: 10_000)
        #expect(dt.universalTime == 10_000)
    }
}

