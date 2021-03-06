require recipes-kernel/linux/linux-mainline-common.inc

LINUX_VERSION ?= "5.3.x"
KERNEL_VERSION_SANITY_SKIP="1"

BRANCH = "linux-5.3.y"
SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${BRANCH} \
"

SRC_URI_append_freedom-u540 = " \
    file://extra.cfg \
    file://0001-PCI-microsemi-Add-host-driver-for-Microsemi-PCIe-con.patch \
    file://0002-Microsemi-PCIe-expansion-board-DT-entry.patch \
    file://0003-HACK-Revert-of-device-Really-only-set-bus-DMA-mask-w.patch \
    file://0004-drm-radeon-handle-PCIe-root-ports-with-addressing-li.patch \
    file://0005-drm-amdgpu-handle-PCIe-root-ports-with-addressing-li.patch \
    file://0006-drm-radeon-simplify-and-cleanup-setting-the-dma-mask.patch \
    file://0007-drm-amdgpu-simplify-and-cleanup-setting-the-dma-mask.patch \
"
